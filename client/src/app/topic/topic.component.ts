import { Component, OnInit, Input } from '@angular/core';
import { TopicService } from './topic.service';
import { Router, ActivatedRoute } from '@angular/router';
import { ITopic } from './topic';
import { ICategory } from '../category/category';

@Component({
  selector: 'app-topic',
  templateUrl: './topic.component.html',
  styleUrls: ['./topic.component.css']
})
export class TopicComponent implements OnInit {
  @Input()
  title: string;
  
  @Input()
  topics: ITopic[];
  errorMessage: string;

  constructor(private _route: ActivatedRoute,
              private _router: Router,
              private _topicService: TopicService) { }

  ngOnInit() {
    console.log('TopicComponent::ngOnInit()');

//https://scotch.io/tutorials/3-ways-to-pass-async-data-to-angular-2-child-components#which-one-should-i-use
//prob need to init topics array with rx/js since it may be updated in real-time...
//currently is initialized in *ngIf
     if(this.topics != null){      
      console.log('TopicComponent::ngOnInit() topics: ' + this.topics.length);
    }else{
      this._topicService.getTopics()
        .subscribe(topics => this.topics = topics,
          error => this.errorMessage = <any>error);
    }
  }

}
