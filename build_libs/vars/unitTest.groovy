def call() {
    env.PATH = "/opt/maven-3.9/bin/:$PATH"
    sh 'mvn test'
}