import { Stats } from "./stats.model";

export class Pokemon{
    
   
    constructor(
        private _id: number,
        private _name: string,
        private _type: Array<string>,
        private _abilities: Array<string>,
        private _baseExperience: number,
        private _moves: Array<string>,
        private _height: number,
        private _heldItems: Array<string>,
        private _sprites: string,
        private _stats: Stats,
        private _weight: number

        ){

        }

        public get abilities(): Array<string> {
            return this._abilities;
        }
        public set abilities(value: Array<string>) {
            this._abilities = value;
        }
        public get type(): Array<string> {
            return this._type;
        }
        public set type(value: Array<string>) {
            this._type = value;
        }
        public get name(): string {
            return this._name;
        }
        public set name(value: string) {
            this._name = value;
        }
        public get id(): number {
            return this._id;
        }
        public set id(value: number) {
            this._id = value;
        }   

        public get stats(): Stats {
            return this._stats;
        }
        public set stats(value: Stats) {
            this._stats = value;
        }
        public get sprites(): string {
            return this._sprites;
        }
        public set sprites(value: string) {
            this._sprites = value;
        }
        public get heldItems(): Array<string> {
            return this._heldItems;
        }
        public set heldItems(value: Array<string>) {
            this._heldItems = value;
        }
        public get height(): number {
            return this._height;
        }
        public set height(value: number) {
            this._height = value;
        }
        public get moves(): Array<string> {
            return this._moves;
        }
        public set moves(value: Array<string>) {
            this._moves = value;
        }
        public get baseExperience(): number {
            return this._baseExperience;
        }
        public set baseExperience(value: number) {
            this._baseExperience = value;
        }

        public get weight(): number {
            return this._weight;
        }
        public set weight(value: number) {
            this._weight = value;
        }
}