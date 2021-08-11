var wave;
let start = 0;
let RandomNumbers = []
let Colors = [];

function setup() {
    createCanvas(windowWidth, windowHeight);
    wave = new p5.Oscillator()
    wave.setType('sine')
    // wave.start()
    wave.amp(0.2)
    wave.freq(300)

    for (let i = 0; i < 550; i++) {
        RandomNumbers[i] = random(300);
        // print(RandomNumbers[i]);
    }

    background(0);
    QuickSort(RandomNumbers, 0, RandomNumbers.length)
    
}

function draw() {
    // background(0);
    // background(24)
}

function PintarLineas(arr, pos) {
    background(0)
    strokeWeight(1)
    for (let i = 0; i < arr.length; i++) {
        if (pos == i) {
            stroke(255, 0, 0);
        } else {
            stroke(255);
        }
        line(start, (windowHeight / 2), start, (windowHeight / 2) - arr[i]);
        // wave.freq(arr[i])
        start += 1;
    }
    start = 50;

}

async function QuickSort(arr, start, end) {
    if (start >= end) {
        return;
    }

    let index = await partition(arr, start, end);
    await QuickSort(arr, index + 1, end)
    await QuickSort(arr, start, index - 1);
    // wave.amp(0)
}

async function partition(arr, start, end) {
    let pivotIndex = start;
    let pivotValue = arr[end];

    for (let i = start; i < end; i++) {

        if (arr[i] < pivotValue) {
            await swap(arr, i, pivotIndex)

            pivotIndex++;
        }
        wave.freq(arr[i]+100)
        PintarLineas(arr, -1)
    }
    await swap(arr, pivotIndex, end)
    return pivotIndex
}




async function swap(arr, a, b) {
    await sleep(1);


    let aux = arr[a];
    arr[a] = arr[b];
    arr[b] = aux;

}

function sleep(time) {
    return new Promise((resolve, reject) => {
        setTimeout(resolve, time);
    });
}