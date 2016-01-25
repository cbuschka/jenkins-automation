import jenkins.automation.builders.CheckmarxSecurityJobBuilder

def projectName ='foo'
def groupId = "your-group-id"
new CheckmarxSecurityJobBuilder(
        name: "${projectName}-checkmarx",
        description: "Sample checkmarx security job",
        useOwnServerCredentials: false,
        serverUrl: "http://sample-serverUrl",
        username: "sample-username",
        password: "sample-password",
        groupId: "",
        scanRepo:[[url: "https://github.com/OrlandoSoto/ckan-browser-tests"]],
        checkmarxComment: "Generated by Checkmarx job builder JAC",
        vulnerabilityThresholdEnabled: true,
        highThreshold: "1",
        mediumThreshold: "2",
        lowThreshold: "3",
        cleanWorkspace: true // Clean up the workspace before every checkout
).build(this);
