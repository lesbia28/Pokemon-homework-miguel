export class Stats{
    
    constructor(
        private _hp: {
            _baseStat: number;
            _effort: number;
        },
        private _attack: {
            _baseStat: number;
            _effort: number;
        },
        private _defense: {
            _baseStat: number;
            _effort: number;
        },
        private _specialAttack: {
            _baseStat: number;
            _effort: number;
        },
        private _specialDefense: {
            _baseStat: number;
            _effort: number;
        },
        private _speed: {
            _baseStat: number;
            _effort: number;
        }

    ){

    }

    public get speed(): {
        _baseStat: number;
        _effort: number;
    } {
        return this._speed;
    }
    public set speed(value: {
        _baseStat: number;
        _effort: number;
    }) {
        this._speed = value;
    }
    public get specialDefense(): {
        _baseStat: number;
        _effort: number;
    } {
        return this._specialDefense;
    }
    public set specialDefense(value: {
        _baseStat: number;
        _effort: number;
    }) {
        this._specialDefense = value;
    }
    public get specialAttack(): {
        _baseStat: number;
        _effort: number;
    } {
        return this._specialAttack;
    }
    public set specialAttack(value: {
        _baseStat: number;
        _effort: number;
    }) {
        this._specialAttack = value;
    }
    public get defense(): {
        _baseStat: number;
        _effort: number;
    } {
        return this._defense;
    }
    public set defense(value: {
        _baseStat: number;
        _effort: number;
    }) {
        this._defense = value;
    }
    public get attack(): {
        _baseStat: number;
        _effort: number;
    } {
        return this._attack;
    }
    public set attack(value: {
        _baseStat: number;
        _effort: number;
    }) {
        this._attack = value;
    }
    public get hp(): {
        _baseStat: number;
        _effort: number;
    } {
        return this._hp;
    }
    public set hp(value: {
        _baseStat: number;
        _effort: number;
    }) {
        this._hp = value;
    }
}