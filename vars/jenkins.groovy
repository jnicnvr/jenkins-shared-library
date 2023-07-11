 def setBuildDescriptionForCiPipeline(branch,commitId,commitAuthor,commitMessage){
    def description = "<br> <b>Branch: </b> ${branch}<br> <b>Commit ID:</b> ${commitId} <br> <b>Author:</b> ${commitAuthor} <br> <b> CommitMessage: </b> ${commitMessage} <br>"
     currentBuild.setDescription(description)
 }
 