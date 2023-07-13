
def build(imageTag,branchName,author,commitId){
    echo "${imageTag}-${branchName}-${author}-${commitId}"
    docker.build(imageTag)
    return G_CI_VAR['isImagePush']
    // "--build-arg BRANCH_NAME=${branchName} --build-arg AUTHOR=${author} --build-arg COMMIT_ID=${commitId} ."
}

def push(imageTag,artifactoryName){
    echo "${imageTag}-${artifactoryName}"
    
    // sh "docker login -u konicsdev -p konics.dev"
    // sh "docker push ${imageTag}"
    // sh 'docker logout'
}

def version(){
   sh 'docker version'
}

def setImageName(String artifactoryName,String image,String branch,String buildNumber){
    return "${artifactoryName}/${image}:${branch.replaceAll("/", "-")}-${buildNumber}"
}