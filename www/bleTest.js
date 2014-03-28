( function() {
	"use strict";

	var exec = require( 'cordova/exec' );

	window.bleTest = function( cb ) {
		exec(
			function() {
				console.log('success',)
				cb( null, true );
			},
			function( error ) {
				cb( error, false );
			},
			'BleTestPlugin',
			'test',
			[]
		);
	};
} );