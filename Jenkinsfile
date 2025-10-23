pipeline {
	agent any

	tools {
		maven 'Maven3'
		jdk 'JDK25'
	}

	triggers {
		pollSCM('H/5 * * * *')
	}

	stages {
		stage('Checkout') {
			steps {
				checkout scm
				echo "📦 Проверяем ветку: ${env.BRANCH_NAME}"
			}
		}

		stage('Build') {
			steps {
				echo "🚀 Собираем и отчищаем проект mvn clean..."
				sh 'mvn -B clean'
			}
		}

		stage('Run Tests') {
			steps {
				sh 'mvn test'
			}
		}

		stage('Review Required') {
			steps {
				script {
					echo "Ожидание ручного ревью..."
					input message: "Одобрить результаты тестов перед мёрджем?", ok: "Approve"
				}
			}
		}

		stage('Merge') {
			when {
				branch 'main'
			}
			steps {
				echo "Мёрдж после ревью"
			}
		}
	}

	post {
		always {
			junit '**/target/surefire-reports/*.xml' // если есть тест-репорты
		}
		success {
			echo "✅ Тесты прошли успешно. Pipeline успешно выполнен!"
		}
		failure {
			echo "❌ Тесты прошли плохо, Pipeline упал :("
		}
	}
}
