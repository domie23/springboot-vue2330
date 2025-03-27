const base = {
    get() {
        return {
            url : "http://localhost:8080/yanjiushengdiaoyanguanli/",
            name: "yanjiushengdiaoyanguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yanjiushengdiaoyanguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "研究生调研管理系统"
        } 
    }
}
export default base
