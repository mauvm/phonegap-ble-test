( function() {
	"use strict";

	var exec = require( 'cordova/exec' );

	window.bleTest = function( cb ) {
		exec(
			function() {
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
} )();