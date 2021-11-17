import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamsCarouselComponent } from './teams-carousel.component';

describe('TeamsCarouselComponent', () => {
  let component: TeamsCarouselComponent;
  let fixture: ComponentFixture<TeamsCarouselComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TeamsCarouselComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TeamsCarouselComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
