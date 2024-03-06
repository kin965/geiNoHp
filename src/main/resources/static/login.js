// app.js
new Vue({
    el: '#app',
    data: {
        username: '',
        password: '',
        message: ''
    },
    methods: {
        login() {
            const formData = {
                username: this.username,
                password: this.password
            };
            axios.post('/api/login', formData)
                .then(response => {
                    this.message = response.data;
                })
                .catch(error => {
                    this.message = '登录失败！';
                    console.error(error);
                });
        }
    }
});
