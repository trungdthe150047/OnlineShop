/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function pagger(pageindex, totalpage, pname, gap, id)
{
    var container = document.getElementById(id);
    container.setAttribute("class", "pagger");

    if (pageindex - gap > 1)
    {
        container.innerHTML += "<a href='shopList?page=1&pname=" + pname + "'>First</a>";
    }

    for (var i = pageindex - gap; i < pageindex; i++)
    {
        if (i > 0)
        {
            container.innerHTML += "<a href='shopList?page=" + i + "&pname=" + pname + "'>" + i + "</a>";
        }
    }

    container.innerHTML += "<span>" + i + "</span>";

    for (var i = pageindex + 1; i <= pageindex + gap; i++)
    {
        if (i < totalpage)
        {
            container.innerHTML += "<a href='shopList?page=" + i + "&pname=" + pname + "'>" + i + "</a>";
        }
    }


    if (pageindex + gap < totalpage)
    {
        container.innerHTML += "<a href='shopList?page=" + totalpage + "&pname=" + pname + "'>Last</a>";
    }
}

//function pagger1(pageindex, totalpage, gap, id)
//{
//    var container = document.getElementById(id);
//    container.setAttribute("class", "pagger");
//
//    if (pageindex - gap > 1)
//    {
//        container.innerHTML += "<a href='shopList?page=1'>First</a>";
//    }
//
//    for (var i = pageindex - gap; i < pageindex; i++)
//    {
//        if (i > 0)
//        {
//            container.innerHTML += "<a href='shopList?page=" + i + "'>" + i + "</a>";
//        }
//    }
//
//    container.innerHTML += "<span>" + i + "</span>";
//
//    for (var i = pageindex + 1; i <= pageindex + gap; i++)
//    {
//        if (i < totalpage)
//        {
//            container.innerHTML += "<a href='shopList?page=" + i + "'>" + i + "</a>";
//        }
//    }
//
//
//    if (pageindex + gap < totalpage)
//    {
//        container.innerHTML += "<a href='shopList?page=" + totalpage + "'>Last</a>";
//    }
//}

