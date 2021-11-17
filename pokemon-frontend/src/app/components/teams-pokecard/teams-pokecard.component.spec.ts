import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamsPokecardComponent } from './teams-pokecard.component';

describe('TeamsPokecardComponent', () => {
  let component: TeamsPokecardComponent;
  let fixture: ComponentFixture<TeamsPokecardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TeamsPokecardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TeamsPokecardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
