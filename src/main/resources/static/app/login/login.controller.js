(function() {
	'use strict';
	
	angular
		.module('app.login')
		.controller('LoginController', LoginController);
	
	LoginController.$inject = ['$scope'];
	
	function LoginController($scope) {
		$scope.user = {
				username: '',
				password: ''
		}
		
		$scope.login = login;
		
		function login () {

		}
	}
})(window.angular)