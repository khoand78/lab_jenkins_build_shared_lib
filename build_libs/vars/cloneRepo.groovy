def call(String branchName) {
    git branch: "${branchName}", credentialsId: '477a8184-857f-41ce-b3d0-5582212129e3', url: 'http://192.168.56.155/root/spring-petclinic.git'
}