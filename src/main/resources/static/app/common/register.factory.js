(function () {
    'use strict';

    angular
        .module('app.common')
        .factory('RegisterFactory', RegisterFactory);

        RegisterFactory.$inject = ['$http'];

        function RegisterFactory($http) {

            return {
                saveNewUser: saveNewUser
            }

            function saveNewUser (user) {
                return $http.post('/user/newUser', user);
            }
        }
})()
