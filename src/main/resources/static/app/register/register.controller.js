(function() {
	'use strict';
	
	angular
		.module('app.register')
		.controller('RegisterController', RegisterController);
	
	RegisterController.$inject = ['$scope'];
	
	function RegisterController ($scope) {
		$scope.user = {
				username: '',
				name: '',
				surname: '',
				email: '',
				password: '',
				repassword: ''
		}
	}
})(window.angular)