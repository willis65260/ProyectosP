var turno = 0;
const GANADORES = [
    [1, 2, 3],
    [1, 4, 7],
    [4, 5, 6],
    [2, 5, 8],
    [7, 8, 9],
    [3, 6, 9],
    [1, 5, 9],
    [3, 5, 7]
];
var jugador1 = [];
var jugador2 = [];
setup();

function setup() {
    obtainBoxes([1, 2, 3, 4, 5, 6, 7, 8, 9]).map((ids) => {
        let StringFromIdsObjects = ids.outerHTML + '';
        ids.onclick = () => {
            turno == 0 ? (
                ids.innerHTML != 'X' && ids.innerHTML != 'O' ? (
                    ids.innerText = 'X',
                    AButtonHasBeenPressed(jugador1, StringFromIdsObjects),
                    SomeOneHasBeenWin(),
                    turno = 1
                ) : (
                    alert("No puedes jugar alli la casilla ya esta llena")
                )
            ) : (
                ids.innerHTML != 'O' && ids.innerHTML != 'X' ? (
                    ids.innerText = 'O',
                    AButtonHasBeenPressed(jugador2, StringFromIdsObjects),
                    SomeOneHasBeenWin(),
                    turno = 0
                ) : (
                    alert("No puedes jugar alli la casilla ya esta llena")
                )
            )
        };
    });
}

function AButtonHasBeenPressed(jugador, StringFromIdsObjects) {
    jugador.push(
        (() => {
            return StringFromIdsObjects.split("").map((car) => {
                if (isNaN(car))
                    return;
                else
                    return car;
            }).filter(obj => !isNaN(obj) && obj.charCodeAt(0) != 32 && obj.charCodeAt(0) != 10)[0];
        })()
    );
}

function obtainBoxes(ids) {
    return nuevosid = ids.map((FromId) => {
        return document.getElementById('' + FromId);
    });
}