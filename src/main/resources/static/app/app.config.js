(function(angular) {
	'use-strict';
	
	angular
		.module('rules-test')
		.config(function($httpProvider) {
		  
		  $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
	
	  	})	
		.config(function($stateProvider, $urlRouterProvider) {
	
			$urlRouterProvider.otherwise("/login");
		
			$stateProvider
				.state('login', {
					url: "/login",
					templateUrl: "loginPage.tmpl.html"
				});
		});
	
})(window.angular)