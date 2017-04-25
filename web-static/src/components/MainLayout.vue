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
                    <div v-for="(item, index) in rows.items">
                        <Submenu :key="item" :label="'items.' + index + '.name'" 
                            :prop="'items.' + index + '.name'" name="'items.' + index + '.name'">    
                            <template slot="title">
                                 <Icon type="ios-navigate"></Icon>导航一
                                 <Menu-item name="1-1">选项 1</Menu-item>
                            </template>
                        </Submenu>
                    </div> 
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
                <div class="layout-content">
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
            
          /* this.$ajax.get('/login/menu').then((response) => {
              this.rows.items=response.data;
            });*/
        }
    }
</script>