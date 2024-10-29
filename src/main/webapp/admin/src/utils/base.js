const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm10r7g/",
            name: "ssm10r7g",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm10r7g/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线作业管理系统"
        } 
    }
}
export default base
