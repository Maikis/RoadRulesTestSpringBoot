(function() {
	'use strict';
	
	angular
		.module('app.login')
		.controller('LoginController', LoginController);
	
	LoginController.$inject = ['$scope', '$state'];
	
	function LoginController($scope, $state) {
		$scope.user = {
				username: '',
				password: ''
		}
		
		$scope.login = login;
		
		function login () {
			$state.go('user.testb');
		}
	}
})(window.angular)