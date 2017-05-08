<style scoped>

.form {
    width: 50%;
}

</style>

<template>
    <div class="form">
        <Button type="primary" @click="modal1 = true">添加</Button>
        <Modal
            v-model="modal1"
            :title="title"
            @on-ok="ok"
            @on-cancel="cancel">
            <i-form>
              <div v-for="(item, index) in cols">
                   <Form-item :label="item.label" prop="name">
                        <i-input v-model="item.name" :placeholder="item.placeholder" :type="item.type"></i-input>
                   </Form-item>
              </div>
           </i-form>
        </Modal>
    </div>
</template>
<script>
    export default {
        data () {
            return {
                modal1: false,
                cols:'',
                title:''
            }
        },
        props:['cols','title'],
        methods: {
            ok () {
                this.$Message.info('点击了确定');
            },
            cancel () {
                this.$Message.info('点击了取消');
            }
        }
    }
</script>