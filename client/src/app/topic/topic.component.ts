import { Component, OnInit, Input } from '@angular/core';
import { TopicService } from './topic.service';
import { ITopic } from './topic';

@Component({
  selector: 'app-topic',
  templateUrl: './topic.component.html',
  styleUrls: ['./topic.component.css']
})
export class TopicComponent implements OnInit {
  @Input()
  title: string;
  topics: ITopic[];
  errorMessage: string;

  constructor(private _topicService: TopicService) { }

  ngOnInit() {
    console.log('---in OnInit()');
    this._topicService.getTopics()
      .subscribe(topics => this.topics = topics,
        error => this.errorMessage = <any>error);
  }

}
