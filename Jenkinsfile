pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''pipeline {
    agent any

    stages {
        stage(\'Log\') {
            steps {
                echo \'Hello World\'
            }
        }
}'''
          sh '''pipeline {
    agent any

    stages {
        stage(\'Build\') {
            steps {
                echo \'Building..\'
            }
        }
}'''
          }
        }

      }
    }