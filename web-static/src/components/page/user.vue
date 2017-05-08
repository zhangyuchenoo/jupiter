<template>
    <div>
        <ModalForm :cols="cols" name="添加" :title="modal_title"></ModalForm>
        <Table border :content="self" :columns="columns7" :data="data6">
        </Table>
    </div>
</template>

<script>
import ModalForm from '../common/ModalForm.vue'

    export default {
        data () {
            return {
                self: this,,
                cols:[{
                    label:'姓名',
                    placeholder:'请输入姓名',
                    type:'input'
                },{
                    label:'年龄',
                    placeholder:'请输入年龄',
                    type:'input'
                },{
                    label:'密码',
                    placeholder:'请输入密码',
                    type:'password'
                },{
                    label:'确认密码',
                    placeholder:'请再次输入密码',
                    type:'password'
                }]
                ,
                modal_title:'添加用户'
            }
        },
        methods: {
            show (index) {
                this.$Modal.info({
                    title: '用户信息',
                    content: `姓名：${this.data6[index].name}<br>年龄：${this.data6[index].age}<br>地址：${this.data6[index].address}`
                })
            },
            remove (index) {
                this.data6.splice(index, 1);
            },
            // setActive(){
            //   console.log('g');
            //   console.log(this.$parent.data);
            //   this.$emit()
            // }
        },
        // mounted() {
        //   this.$nextTick(function() {
        //     this.setActive()
        //   })
        // }
        components:{ModalForm}
    }
</script>
