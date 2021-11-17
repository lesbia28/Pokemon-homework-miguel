import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainersCardComponent } from './trainers-card.component';

describe('TrainersCardComponent', () => {
  let component: TrainersCardComponent;
  let fixture: ComponentFixture<TrainersCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrainersCardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainersCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
