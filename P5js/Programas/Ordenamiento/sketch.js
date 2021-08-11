let RandomNumbers = [];
let RandomNumbers2 = [];

function setup() {
    createCanvas(windowWidth, windowHeight);
    let xoff;
    for (let i = 0; i < 250; i++) {

        // let n = noise(i / 10) * 50;
        RandomNumbers[i] = random(400);
        RandomNumbers2[i] = RandomNumbers[i];
        print(RandomNumbers[i]);
    }

    background(0);
    QuickSort(RandomNumbers, 0, RandomNumbers.length)
    BubbleSort(RandomNumbers)
}

function draw() {
    
    // PintarLineas(arr,-1)
    // frameRate(0)
}
let start = 50;

function PintarLineas(arr, pos) {
    fill(0)
    // noStroke()
    rect(0,-height,windowWidth,(windowHeight/2))
    strokeWeight();
    background(0)
    for (let i = 0; i < arr.length; i++) {
        if (pos == i) {
            stroke(255, 0, 0);
        } else {
            stroke(255);
        }
        line(start, (windowHeight / 2), start, (windowHeight / 2) - arr[i]);
        start += 1;
    }
    start = 50;
    
}


async function BubbleSort(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length - 1 - i; j++) {

            await sleep(10);
            // background(0);
            if (arr[j] > arr[j + 1]) {
                let aux = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = aux;
            }
            PintarLineas(arr, j + 1, (-windowHeight/2));


        }
    }
    for (let j = 0; j < arr.length; j++) {
        await sleep(0);
        PintarLineas(arr, j, -200);
    }
    PintarLineas(arr, -1, (-windowHeight/2));
}

async function QuickSort(arr, start, end) {
    if (start >= end) {
        for (let j = 0; j < arr.length; j++) {
            await sleep(10)
            PintarLineas(arr, j, 0)
        }
        return;
    }

    let index = await partition(arr, start, end);
    await QuickSort(arr, index + 1, end)
    await QuickSort(arr, start, index - 1);
    

    

    // PintarLineas(arr, -1, 0)
}

async function partition(arr, start, end) {
    let pivotIndex = start;
    let pivotValue = arr[end];

    for (let i = start; i < end; i++) {

        if (arr[i] < pivotValue) {
            await swap(arr, i, pivotIndex)

            pivotIndex++;
        }
        PintarLineas(arr, -1)
    }
    await swap(arr, pivotIndex, end)
    return pivotIndex
}




async function swap(arr, a, b) {
    await sleep(10);


    let aux = arr[a];
    arr[a] = arr[b];
    arr[b] = aux;

}

function sleep(time) {
    return new Promise((resolve, reject) => {
        setTimeout(resolve, time);
    });
}

// function QuickSort(low, high) {
//     if (low < high) {
//         // await sleep(10);
//         let pivot = position(low, high);
//         console.log("low "+low+" pivot "+pivot+" high "+high);
//         QuickSort(low, pivot-1);
//         QuickSort(pivot + 1, high);
//         // PintarLineas(arr,l);
//     }else{
//        return
//     }

// }

// function position(low, high) {
//     let pivot = RandomNumbers[low];
//     l = low;
//     h = high;

//     while (true) {

//         do {
//             l++
//         } while (RandomNumbers[l] < pivot);

//         do {
//             h--
//         } while (RandomNumbers[h] > pivot);

//         if (l < h) {
//             // await sleep(10);
//             
//             // PintarLineas(arr,l);
//         }

//         if (l > h) {

//             return h;
//         }

//     }
// }