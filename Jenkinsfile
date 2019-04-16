pipeline{
    agent any

    tools {
        maven "Maven 3.6.1"
        jdk "java 8"
    }

    stages {
        stage("Build"){
            steps{
                echo "building the Project"
                sh "mvn clean package"

            }
        }
    }
}