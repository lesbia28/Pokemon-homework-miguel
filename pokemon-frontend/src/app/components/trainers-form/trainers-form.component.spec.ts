import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainersFormComponent } from './trainers-form.component';

describe('TrainersFormComponent', () => {
  let component: TrainersFormComponent;
  let fixture: ComponentFixture<TrainersFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrainersFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainersFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
