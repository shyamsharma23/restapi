pipeline {
  agent {
    node {
      label 'agent1'
    }

  }
  stages {
    stage('Build') {
      steps {
        echo 'Hello World'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deployed'
      }
    }

  }
}