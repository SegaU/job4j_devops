pipeline {
	agent {
		label 'agent1'
	}

	tools {
		git 'Default'
	}

	stages {
		stage('Prepare Environment') {
			steps {
				script {
					sh 'chmod +x ./gradlew'
				}
			}
		}

		stage('Build') {
			parallel {
				stage('Checkstyle Main') {
					steps {
						echo 'Checkstyle Main'
					}
				}
				stage('Checkstyle Test') {
					steps {
						echo 'Checkstyle Main'
					}
				}

				stage('Build') {
					steps {
						echo 'Build'
					}
				}

				stage('Test') {
					steps {
						echo 'Test'
						echo 'JaCoCo Report'
						echo 'JaCoCo Verification'
					}
				}
			}
		}
	}

	post {
		always {
			script {
				def buildInfo = "Build number: ${currentBuild.number}\n" +
				"Build status: ${currentBuild.currentResult}\n" +
				"Started at: ${new Date(currentBuild.startTimeInMillis)}\n" +
				"Duration so far: ${currentBuild.durationString}"
				telegramSend(message: buildInfo)
			}
		}
	}
}