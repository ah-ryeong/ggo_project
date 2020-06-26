$(function(){
		$('.mobile .hamberger').click(function(e){
			if($(this).hasClass('open')){
				$(this).removeClass('open');
				$('.mobile_menu').animate({
					right: '-100%'
				}, 500);
			} else {
				$(this).addClass('open');
				$('.mobile_menu').animate({
					right: '0'
				}, 500);
			}
		});
	});

$('.partnership_insert').click(function(){
	var options = {
		beforeSubmit:applyBefore,
		success: applyAfter,
		dataType: 'json',
		type: 'POST',
	};
	$('#partnership_form').ajaxSubmit(options);
});


function applyBefore() {

	var filechks;

	if($('#category option:selected').val() == ''){
        alert('분야를 선택 하셔야합니다.');
        $('#category').focus();
        return false;
    }

	if($('#subject').val() == '') {
		alert('제목을 입력해주세요.');
		$('#subject').focus();
		return false;
	}
	if($('#content').val() == '') {
		alert('내용을 입력해주세요.');
		$('#content').focus();
		return false;
	}
    if($('#userfile').val() == '') {
	} else {
		filechks = fileChk('userfile');
		if(filechks != true) return false;
	}
	if($('#company').val() == '') {
		alert('업체명을 입력해주세요.');
		$('#company').focus();
		return false;
	}
	if($('#tel').val() == '') {
		alert('연락처를 입력해주세요.');
		$('#tel').focus();
		return false;
	}
	if($('#email').val() == '') {
		alert('이메일을 입력해주세요.');
		$('#email').focus();
		return false;
	}

    if(!$('input:checkbox[id="agree"]').is(":checked")){
        alert('개인정보 수집 이용동의를 하셔야합니다.');
        $('input:checkbox[id="agree"]').focus();
        return false;
    }
    if($('#submitChk').val() == 'N') {
        $('#submitChk').val('Y');
    }else {
        alert('데이터 전송중입니다.');
        return false;
    }



}
function fileChk(val) {
	var ext = $('#'+val).val().split('.').pop().toLowerCase();
    var fileSize = document.getElementById(val).files[0].size;
	var fileMBsize = 10;
    var maxSize = fileMBsize * 1024 * 1024;

	if($.inArray(ext, ['pdf','hwp','docx','doc','ppt','pptx','gif','png','jpg','jpeg','pdf']) == -1) {
		alert(ext + '은(는) 등록 할수 없는 파일확장자입니다.');
		$("#"+val).val("");
		$("#"+val).focus();
		return 'ext';
	}
	if(fileSize > maxSize){
		alert('첨부파일 크기는 '+fileMBsize+'MB 이내로 등록 가능합니다.');
		$("#"+val).focus();
		return 'size';
	}
	return true;
}
function applyAfter(response, status) {
	if(status == 'success') {
		if(response.result == 'success') {
			alert('신청되었습니다.');
			location.reload();
		} else if(response.result == 'error'){
			alert('등록에 실패하였습니다. 다시 신청해주세요.');
			location.reload();
		} else {
			alert(response.result);
			location.reload();
		}
	} else {
		alert('등록에 실패하였습니다. 다시 신청해주세요.');
		location.reload();
	}
}