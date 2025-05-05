def call(String sonarServerName) {
    timeout(time: 2, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: true
    }
}
