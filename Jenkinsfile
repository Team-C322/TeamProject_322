pipeline {
	agent any

	tools {
		maven 'Maven3'
		jdk 'JDK21'
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
			when {
				anyOf {
					branch 'main'
					changeRequest()  // это PR
				}
			}
			steps {
				echo "🚀 Собираем и отчищаем проект mvn clean..."
				sh 'mvn -B clean'
			}
		}

		stage('Run Tests') {
			when {
				anyOf {
					branch 'main'
					changeRequest()
				}
			}
			steps {
				sh 'mvn test'
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
			script {
				if (env.BRANCH_NAME == 'main' || env.CHANGE_ID) {
					junit '**/target/surefire-reports/*.xml'
				}
			}
		}
		success {
			echo "✅ Pipeline успешно выполнен!"
		}
		failure {
			echo "❌ Pipeline упал :("
		}
	}
}