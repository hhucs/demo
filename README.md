

## 系统说明

- 利用 pig 和pig-UI 进行二次开发

运行步骤：


1. 修改pig-ui文件夹内main.js， 引入Echart依赖
插入下面两行
import * as echarts from 'echarts'
Vue.prototype.$echarts = echarts

2.  如果已经安装了pig-ui的依赖，删除pig-ui目录下的安装包文件夹node_modules
重新运行 cnpm install，自动安装 echart 依赖

3. 把db目录下的两个SQL文件插入mysql，生成pig_demo数据库，两个表和相关的menu表单

4. 打开application.yml, 更新本机的的mysql密码，运行DemoApplication.java，后台开启新的微服务，检查MYSQl数据库是否正常

5. 将demo-ui文件夹下的文件，移动到原有pig-ui/src  合并

6. 进入pig-ui 文件夹，运行npm run dev

登录系统后，如果没有看到demo菜单，则进入角色管理进行配置 

 


