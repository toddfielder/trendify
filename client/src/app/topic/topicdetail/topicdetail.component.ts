import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Subscription }       from 'rxjs/Subscription';

import { ITopic } from '../topic';
import { TopicService } from '../topic.service';

//https://scotch.io/tutorials/3-ways-to-pass-async-data-to-angular-2-child-components#which-one-should-i-use
@Component({
  selector: 'app-categorydetail',
  templateUrl: './topicdetail.component.html',
  styleUrls: ['./topicdetail.component.css']
})
export class TopicDetailComponent implements OnInit {
    topic: ITopic;
    errorMessage: string;
    private sub: Subscription;
    
    constructor(private _route: ActivatedRoute,
                private _router: Router,
                private _topicService: TopicService) {
    }

    ngOnInit(): void {
        console.log("CategoryDetailComponent::ngOnInit()");
        this.sub = this._route.params.subscribe(
            params => {
                let id = +params['id'];
                this.getTopic(id);
        });
    }

    ngOnDestroy() {
        this.sub.unsubscribe();
    }

    getTopic(id: number) {
        this._topicService.getTopic(id).subscribe(
            topic => this.topic = topic,
            error => this.errorMessage = <any>error);
    }

    onBack(): void {
        this._router.navigate(['/topic']);
    }

}
