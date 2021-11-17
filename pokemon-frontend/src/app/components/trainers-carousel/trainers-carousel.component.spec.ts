import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainersCarouselComponent } from './trainers-carousel.component';

describe('TrainersCarouselComponent', () => {
  let component: TrainersCarouselComponent;
  let fixture: ComponentFixture<TrainersCarouselComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrainersCarouselComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainersCarouselComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
