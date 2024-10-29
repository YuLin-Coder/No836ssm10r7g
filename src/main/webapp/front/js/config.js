
var projectName = '在线作业管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '作业信息',
	url: './pages/zuoyexinxi/list.html'
}, 
{
	name: '教学资源',
	url: './pages/jiaoxueziyuan/list.html'
}, 

{
	name: '通知公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm10r7g/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"作业信息","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业答案","menuJump":"列表","tableName":"zuoyedaan"}],"menu":"作业答案管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业批阅","menuJump":"列表","tableName":"zuoyepiyue"}],"menu":"作业批阅管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教学资源","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源管理"},{"child":[{"buttons":["查看","导出"],"menu":"作业统计","menuJump":"列表","tableName":"zuoyetongji"}],"menu":"作业统计管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","作业提交"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"},{"child":[{"buttons":["查看"],"menu":"教学资源列表","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","作业提交"],"menu":"作业信息","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息管理"},{"child":[{"buttons":["查看"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看"],"menu":"作业答案","menuJump":"列表","tableName":"zuoyedaan"}],"menu":"作业答案管理"},{"child":[{"buttons":["查看"],"menu":"作业批阅","menuJump":"列表","tableName":"zuoyepiyue"}],"menu":"作业批阅管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生留言","menuJump":"列表","tableName":"xueshengliuyan"}],"menu":"学生留言管理"}],"frontMenu":[{"child":[{"buttons":["查看","作业提交"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"},{"child":[{"buttons":["查看"],"menu":"教学资源列表","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","答案上传"],"menu":"作业信息","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息管理"},{"child":[{"buttons":["查看","作业批阅"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业答案","menuJump":"列表","tableName":"zuoyedaan"}],"menu":"作业答案管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"作业批阅","menuJump":"列表","tableName":"zuoyepiyue"}],"menu":"作业批阅管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教学资源","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源管理"},{"child":[{"buttons":["新增","查看","修改","删除","导出"],"menu":"作业统计","menuJump":"列表","tableName":"zuoyetongji"}],"menu":"作业统计管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生留言","menuJump":"列表","tableName":"xueshengliuyan"}],"menu":"学生留言管理"}],"frontMenu":[{"child":[{"buttons":["查看","作业提交"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"},{"child":[{"buttons":["查看"],"menu":"教学资源列表","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
