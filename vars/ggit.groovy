def getAuthor(){
    return sh(returnStdout: true, script: 'git log -1 --pretty=format:"%an"').trim()
}

def getCommitMessage(){
    return sh(returnStdout: true, script: 'git log -1 --pretty=format:"%an"').trim()
}