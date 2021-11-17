
export class PokemonSlim{
   
    constructor(
        private _id: number,
        private _name: string,
        private _url: string,
        private _spriteUrl: string
    ) {}

    public get id(): number {
        return this._id;
    }
    public set id(value: number) {
        this._id = value;
    }   
    public get name(): string {
        return this._name;
    }
    public set name(value: string) {
        this._name = value;
    }
    public get url(): string {
        return this._url;
    }
    public set url(value: string) {
        this._url = value;
    }
    public get spriteUrl(): string {
        return this._spriteUrl;
    }
    public set spriteUrl(value: string) {
        this._spriteUrl = value;
    } 
}