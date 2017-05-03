<style scoped>
    .layout{
        border: 1px solid #d7dde4;
        background: #f5f7f9;
        position: relative;
    }
    .layout-breadcrumb{
        padding: 10px 15px 0;
    }
    .layout-content{
        min-height: 200px;
        margin: 15px;
        overflow: hidden;
        background: #fff;
        border-radius: 4px;
    }
    .layout-content-main{
        padding: 10px;
    }
    .layout-copy{
        text-align: center;
        padding: 10px 0 20px;
        color: #9ea7b4;
    }
    .layout-menu-left{
        background: #464c5b;
    }
    .layout-header{
        height: 60px;
        background: #fff;
        box-shadow: 0 1px 1px rgba(0,0,0,.1);
    }
    .layout-logo-left{
        width: 90%;
        height: 30px;
        background: #5b6270;
        border-radius: 3px;
        margin: 15px auto;
    }
</style>
<template>
    <div class="layout">
        <Row type="flex">
            <i-col span="5" class="layout-menu-left">
                <Menu active-name="1-2" theme="dark" width="auto" :open-names="['1']">
                    <div class="layout-logo-left"></div>
                    <Submenu :key="item" :label="'items.' + index + '.name'" 
                        :prop="'items.' + index + '.name'" name="'items.' + index + '.name'">    
                        <template slot="title">
                             <Icon type="ios-navigate"></Icon>公告法规检索
                        </template>
                        <Menu-item name="1-1" >分类1</Menu-item>
                    </Submenu>
                    <Submenu :key="item" :label="'items.' + index + '.name'" 
                        :prop="'items.' + index + '.name'" name="'items.' + index + '.name'">    
                        <template slot="title">
                             <Icon type="ios-navigate"></Icon>信息披露检索
                        </template>
                        <Menu-item name="2-1" on-select="test">分类2</Menu-item>
                    </Submenu>
                  
                </Menu>
            </i-col>
            <i-col span="19">
                <div class="layout-header"></div>
                <div class="layout-breadcrumb">
                    <Breadcrumb>
                        <Breadcrumb-item href="#">首页</Breadcrumb-item>
                        <Breadcrumb-item href="#">应用中心</Breadcrumb-item>
                        <Breadcrumb-item>某应用</Breadcrumb-item>
                    </Breadcrumb>
                </div>
                <div class="layout-content" id="main_content">
                    <div class="layout-content-main">内容区域</div>
                </div>
                <div class="layout-copy">
                    2011-2016 &copy; TalkingData
                </div>
            </i-col>
        </Row>
    </div>
</template>
<script>
import VueResource from 'vue-resource'
export default {
    data:function(){
        return {
            rows:{items:[{
                name:'menu',
                path:'/'
            }]}
        };
    },
    created:function(){
    
        this.$ajax.get('/login/info').then((response)=>{
            if('ok'!=response.data){
                console.log('-------');
                //显示登录对话框
            }
            console.log(response);
        });
    }
}
    
    
const NotFound = { template: '<p>Page not found</p>' }
const Home = { template: '<p>home page</p>' }
const About = { template: '<p>about page</p>' }
const routes = {
  '/': Home,
  '/about': About
}

function test(){
    new Vue({
        el:'#main_content',
        render: h=>h(routes['/'])
    });
}

</script>