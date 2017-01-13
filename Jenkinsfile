node {
	stage 'Checkout'
		checkout scm
	    /* .. snip .. */
    stage('Build') {
        bat 'make' // <1>
        archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true // <2>
    }
    /* .. snip .. */

}
