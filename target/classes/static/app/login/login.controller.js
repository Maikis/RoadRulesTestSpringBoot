(function() {
	'use strict';
	
	angular
		.module('app.login')
		.controller('LoginController', LoginController);
	
	LoginController.$inject = ['$scope'];
	
	function LoginController($scope) {
		$scope.user = {
				username: 'JohnSmith',
				password: 'xxxxxxx'
		}
	}
})(window.angular)