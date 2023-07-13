
def build(imageTag,branchName,author,commitId){
    echo "${imageTag}-${branchName}-${author}-${commitId}"
    sh "docker build -t ${imageTag} --build-arg BRANCH_NAME=${branchName} --build-arg AUTHOR=${author} --build-arg COMMIT_ID=${commitId} ."
}

def version(){
   sh 'docker version'
}

def setImageName(String artifactoryName,String image,String branch,String buildNumber){
    return "${artifactoryName}/${image}:${branch}-${buildNumber}"
}