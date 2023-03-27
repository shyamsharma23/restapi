pipeline {
  agent any
  stages {
    stage('Log') {
      steps {
        sh 'echo "Hello World"'
      }
    }

    stage('Build') {
      steps {
        sh 'docker build -t apisimage .'
      }
    }

  }
}