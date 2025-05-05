def call(String sonarCredentialId) {
    withSonarQubeEnv('SonarQubeServer') {
        sh 'mvn sonar:sonar'
    }
}
