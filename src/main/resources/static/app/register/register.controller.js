(function () {
	'use strict';
	
	angular
		.module('app.register')
		.controller('RegisterController', RegisterController);
	
	RegisterController.$inject = ['$scope', '$state', 'RegisterFactory'];
	
	function RegisterController ($scope, $state, RegisterFactory) {
		$scope.user = {
				username: '',
				name: '',
				surname: '',
				email: '',
				password: '',
				repassword: ''
		}

	    $scope.saveUser = saveUser;

	    function saveUser () {
	        if ($scope.registerClicked) {
	            return;
	        }

	        $scope.registerClicked = true;

            RegisterFactory
                .saveNewUser($scope.user)
                .then(function success () {
                    /*$state.go('user.testb');*/
                    $scope.errorMsg = 'Successfully registered to our product!';
                }, function error() {
                    $scope.errorMsg = 'Whoooops! registration failed. Please try again!';
                });
	    }

	}
})(window.angular)