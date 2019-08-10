window.addEventListener("load", function()
{
	var copyRightFooter = document.querySelector('[role="contentinfo"]');
	var notice = 'This documentation is dedicated to the public domain under '
	+ '<a href="https://github.com/dynamicgui/documentation/blob/master/LICENSE"> CC0 1.0 Universal.</a>';
	copyRightFooter.innerHTML = notice;
	console.log("Footer loaded");
});