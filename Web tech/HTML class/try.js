

const button = document.querySelector('.btn1');
button.addEventListener('click', function (event) {
    let nc = document.getElementsByClassName('.form').elements;
    for (let i = 0; i < nc.length(); i++) {
        let item = elements.item(i);
        console.log(item);
    }
})
