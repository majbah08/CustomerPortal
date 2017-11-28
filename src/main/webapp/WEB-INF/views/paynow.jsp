<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@ page session="false" %>
<html>
<head>
	<title>PayNow</title>
	
	<style>
.databox {
    height: 200px;
    width: 50%;
    position: absolute;
     margin-left:500px
}

#header { color: #337ab7; }

#table { 
    border-spacing: 10px;
    border-collapse: separate;
}


</style>

 <script type="text/javascript">
            function validate_required(field, alerttxt){
            with (field) {
            if (value == null || value == "") {
            alert(alerttxt); return false;
            } else {
            return true;
            }
            }
            }

            function validate_form(thisform){
            with (thisform){
            if (validate_required(email, "Email must be filled out!") == false){
            email.focus(); return false;
            }
            }
            }
        </script>
        <meta http-equiv="content-type" content="text/html; charset=windows-1257">
        <title></title>
        <script type="text/javascript" language="javascript">

            function checkForm(){
            var cAmount, cDesc, cId;
                    with (window.document.fr_merchant){
            cAmount = Amount;
                    cDesc = Desc;
            }

            if (trim(cAmount.value) == ''){
            alert('Please enter Amount');
                    cAmount.focus();
                    return false;
            }
            else if (trim(cDesc.value) == '')
            {
            alert('Please enter your Deascription');
                    cDesc.focus();
                    return false;
            } else if (trim(cId.value) == '')
            {
            alert('Please enter your Id');
                    cId.focus();
                    return false;
            }
            else
            {
            cAmount.value = trim(cAmount.value);
                    cDesc.value = trim(cDesc.value);
                    return true;
            }
            }

            function trim(str)
            {
            return str.replace(/^\s+|\s+$/g, '');
            }

            function isEmail(str)
            {
            var regex = /^[-_.a-z0-9]+@(([-_a-z0-9]+\.)+(ad|ae|aero|af|ag|
                    ai | al | am | an | ao | aq | ar | arpa | as | at | au | aw | az | ba | bb | bd | be | bf | bg |
                    bh | bi | biz | bj | bm | bn | bo | br | bs | bt | bv | bw | by | bz | ca | cc | cd | cf | cg |
                    ch | ci | ck | cl | cm | cn | co | com | coop | cr | cs | cu | cv | cx | cy | cz | de | dj | dk |
                    dm | do | dz | ec | edu | ee | eg | eh | er | es | et | eu | fi | fj | fk | fm | fo | fr | ga | gb |
                    gd | ge | gf | gh | gi | gl | gm | gn | gov | gp | gq | gr | gs | gt | gu | gw | gy | hk | hm | hn |
                    hr | ht | hu | id | ie | il | in | info | int | io | iq | ir | is | it | jm | jo | jp | ke | kg |
                    kh | ki | km | kn | kp | kr | kw | ky | kz | la | lb | lc | li | lk | lr | ls | lt | lu | lv | ly |
                    ma | mc | md | mg | mh | mil | mk | ml | mm | mn | mo | mp | mq | mr | ms | mt | mu | museum |
                    mv | mw | mx | my | mz | na | name | nc | ne | net | nf | ng | ni | nl | no | np | nr | nt | nu |
                    nz | om | org | pa | pe | pf | pg | ph | pk | pl | pm | pn | pr | pro | ps | pt | pw | py | qa |
                    re | ro | ru | rw | sa | sb | sc | sd | se | sg | sh | si | sj | sk | sl | sm | sn | so | sr | st |
                    su | sv | sy | sz | tc | td | tf | tg | th | tj | tk | tm | tn | to | tp | tr | tt | tv | tw | tz |
                    ua | ug | uk | um | us | uy | uz | va | vc | ve | vg | vi | vn | vu | wf | ws | ye | yt | yu | za |
                    zm | zw) | (([0 - 9][0 - 9]? | [0 - 1][0 - 9][0 - 9] | [2][0 - 4][0 - 9] | [2][5][0 - 5])\.){3}([0 - 9][0 - 9]? | [0 - 1][0 - 9][0 - 9] | [2][0 - 4][0 - 9] | [2][5][0 - 5]))$ / i;
                    return regex.test(str);
            }
        </script>




</head>
<body>
<%@include  file="blank.html" %>
 <div id="page-wrapper">
 <div class="row">
               <div class="col-lg-12">
                   <div class="panel panel-heading">
   <div>
   <h1 id="header">Payment</h1> 
   </div>
   <hr>



<table class="table table-responsive">
  <tr><th>Pakage Name:</th> <td> <c:out value="${cat_list.NAME} " /></td></tr>
  <tr><th>Pakage Rate:</th> <td> <c:out value="${cat_list.RATE} "/></td></tr>

</table>


<hr>

 <s:form name="fr_merchant" action="${pageContext.request.contextPath}/customer/paynow"  method="post" onSubmit="checkForm();"><br>
                                                    <table border="0" bordercolor="#F5F5F5" cellspacing="0" cellpadding="1" style="font: normal 8pt Verdana" id="table" align="left">
                                                        <tr>
                                                            <td><font size="2"><b>Amount(Tk.):</b></font></td>
                                                            <td><input type="text" maxlength="12" value="${cat_list.RATE}" readonly name="Amount"></td>
                                                        </tr>
                                                        <tr>
                                                            <td><font size="2"><b>Description:</b></font></td>
                                                            <td><input type="text" maxlength="125" name="Desc"value="${phoneno}" readonly></td>
                                                        </tr>
                                                        <tr> 
                                                            <td><font size="2"><b>Pay with:</b></font></td>
                                                            <td> 
                                                                <table>
                                                                    <tr>
                                                                        <td>
                                                                            <input type="radio" name="Ctype" value="1" checked>
                                                                            <img src="../resources/image/dbbl-nexus.png"/>
                                                                        </td>
                                                                        <td>
                                                                            <input type="radio" name="Ctype" value="2">
                                                                            <img src="../resources/image/dbbl-master.png"/>
                                                                        </td>
                                                                        <td>
                                                                            <input type="radio" name="Ctype" value="3">
                                                                            <img src="../resources/image/dbbl-visa.png"/>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td>
                                                                            <input type="radio" name="Ctype" value="4">
                                                                            <img src="../resources/image/visa.png"/>
                                                                        </td>
                                                                        <td>
                                                                            <input type="radio" name="Ctype" value="5">
                                                                            <img src="../resources/image/master.png"/>
                                                                        </td>
                                                                        <td>
                                                                            <input type="radio" name="Ctype" value="6">
                                                                            <img src="../resources/image/dbbl-mb.png"/>
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td colspan="2">&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td colspan="2" bgcolor="#C0C0C0">
                                                                <div align="center">
                                                                    <input id="submit" name="submit" type="submit" value="Submit" style="font: bold 8pt Verdana" class="btn btn-sm btn-success btn-block" onClick="return checkForm();">
                                                                </div>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </s:form>






</div>

</div>
</div>
</div>
</body>
</html>
