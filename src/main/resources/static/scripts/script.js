'use strict';

let onLoadRequest = () => { // шаблон для классического http- запроса
    $.ajax({
        url : '/onLoadIndex', // специфицировать url
        type : 'GET', // специфицировать тип запроса
        //dataype : 'html',
        datatype : '/application-json', //специфицировать тип даннных которые мы получаем с бэка
        // data : {
        //     type: 'string',
        //     user: {
        //         username: 'xxx',
        //         password: 'yyy'
        //     }
        // }

        // success - блок кода который выполнится в случае удачного запроса (200)
        success: function (data) { // данные которые мы заполняем на бэке
            console.log(data);
            let responce = JSON.parse(data); // парсер JSON
            console.log(responce);
            /*completeCategoryCaptions(responce);
            completeCategoryImages(responce);*/
            completeCategories(responce.categories); // заполняем блок категорий сначала заголовки , потом картинки
            completeBrands(responce.brands);
            console.log(responce.categories);
            console.log(responce.brands);
        }
    })
}

let completeCategories = (category) => {
    completeCategoryCaptions(category); //заголовки
    completeCategoryImages(category); // картинки
}

let completeBrands = (brand) => {
    completeBrandsImages(brand);
}

let completeCategoryCaptions = (categories) => { // заголовки категорий
    let captions = document.querySelectorAll(".group_caption"); // выбираем все заголовки
    for (let i = 0; i < captions.length; i++) {
        captions[i].innerHTML = '<p>' + categories[i] + '</p>';  // вставляем параграф с названием категории
    }
}

let completeCategoryImages = (categories) => { // картинки категорий
    let imageDivs = document.querySelectorAll(".group_img"); // выбираем все картинки
    let img;
    for (let i = 0; i < categories.length; i++) {
        img = imageDivs[i].querySelector("img");
        img.src = '/img/categories/' + categories[i] + '.jpg';
        //img.src = `/img/categories/${categories[i]}.jpg}`;
    }
}

let completeBrandsImages = (brands) => {
    let imageDivs = document.querySelectorAll(".brand");
    let img;
    for (let i = 0; i < brands.length; i++) {
        img = imageDivs[i].querySelector("img");
        img.src = '/img/brands/' + brands[i] + '.jpg';
    }
}

onLoadRequest();